# gardengeek

git init
git add * -f
git commit -m "first commit"
git branch -M main
git remote origin add https://github.com/thedawn40/gardengeek.git
git push -u origin main

cara menggunakan API :
- import API melalui aplikasi postman
- salin curl dibawah ini saat melakukan import

#deret fibonacci
curl --location 'localhost:8080/deretFibonacci' \
--header 'Content-Type: application/json' \
--data '{
    "deretBilangan": 10
}'

#non palindrom
curl --location 'localhost:8080/nonPalindrom' \
--header 'Content-Type: application/json' \
--data '{
    "input": "racecar"
}'
