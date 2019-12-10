#!/bin/sh

cd product/
mvn clean install
docker build -t gcr.io/project-vnv/product:v1 .
docker push gcr.io/project-vnv/product:v1


cd detail/
mvn clean install
docker build -t gcr.io/project-vnv/detail:v1 .
docker push gcr.io/project-vnv/detail:v1

echo 'All Build Done'
