package demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.function.Fibonacci;
import demo.function.Palindrom;

@RestController
public class TestController {
		
	
	@PostMapping("/deretFibonacci")
	public Map<String,Object> fibonacci(@RequestBody Map<String,Object> map){
		Map<String,Object> mapResult = new HashMap<>();
		try {
			Fibonacci fibonacci = new Fibonacci();
			int hasil = 0;
			int deretFibonacci = (int) map.get("deretBilangan");
			hasil = fibonacci.deretFibonacci(deretFibonacci);
			mapResult.put("success", true);
			mapResult.put("result", hasil);
			
		}catch(Exception e) {
			mapResult.put("success", false);
			mapResult.put("result", e.getMessage());
			e.printStackTrace();
		}
		return mapResult;
	}
	
	@PostMapping("/nonPalindrom")
	public Map<String,Object> nonPalindrom(@RequestBody Map<String,Object> map){
		Map<String,Object> mapResult = new HashMap<>();
		try {
			Palindrom palindrom = new Palindrom();
			String hasil = "";
			String s = map.get("input").toString();
			hasil = palindrom.longestNonPalindromeSubstring(s);
			mapResult.put("success", true);
			mapResult.put("result", hasil);
			
		}catch(Exception e) {
			mapResult.put("success", false);
			mapResult.put("result", e.getMessage());
			e.printStackTrace();
		}
		return mapResult;
	}
	

}
