#!/bin/sh

echo '===================================================================================='
echo '      Start Build code, build docker image and push to registery'
echo '===================================================================================='

cd product/
mvn clean install
docker build -t gcr.io/project-vnv/product:v1 .
docker push gcr.io/project-vnv/product:v1


cd ../detail/
mvn clean install
docker build -t gcr.io/project-vnv/detail:v1 .
docker push gcr.io/project-vnv/detail:v1

cd ../rettings/
mvn clean install
docker build -t gcr.io/project-vnv/rettings:v1 .
docker push gcr.io/project-vnv/rettings:v1


cd ../review-1/
mvn clean install
docker build -t gcr.io/project-vnv/review-1:v1 .
docker push gcr.io/project-vnv/review-1:v1

cd ../review-2/
mvn clean install
docker build -t gcr.io/project-vnv/review-2:v1 .
docker push gcr.io/project-vnv/review-2:v1

cd ../review-3/
mvn clean install
docker build -t gcr.io/project-vnv/review-3:v1 .
docker push gcr.io/project-vnv/review-3:v1

echo '===================================================================================='
echo '                              All Build Done                                        '
echo '===================================================================================='
