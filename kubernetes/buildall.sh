#!/bin/sh

echo '================================================================'
echo '      Starting code build, docker build and push processing.                            '
echo '================================================================'

cd product/
mvn clean install
docker build -t gcr.io/project-vnv/product:v1 .
docker push gcr.io/project-vnv/product:v1


cd detail/
mvn clean install
docker build -t gcr.io/project-vnv/detail:v1 .
docker push gcr.io/project-vnv/detail:v1


cd rettings/
mvn clean install
docker build -t gcr.io/project-vnv/rettings:v1 .
docker push gcr.io/project-vnv/rettings:v1

cd review-1/
mvn clean install
docker build -t gcr.io/project-vnv/review1:v1 .
docker push gcr.io/project-vnv/review1:v1

cd review-2/
mvn clean install
docker build -t gcr.io/project-vnv/review2:v1 .
docker push gcr.io/project-vnv/review2:v1

cd review-2/
mvn clean install
docker build -t gcr.io/project-vnv/review2:v1 .
docker push gcr.io/project-vnv/review2:v1

echo '================================================================'
echo '                      All Build Done                            '
echo '================================================================'
