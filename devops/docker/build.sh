#!/bin/bash
cd /home/fabio/ls/demo-web-app/
git pull
./mvnw package -DskipTests
cd /home/fabio/ls/demo-web-app/devops/docker
cp /home/fabio/ls/demo-web-app/target/demo-web-app-0.0.1-SNAPSHOT.jar .

docker stop demo-web-app
docker build --no-cache -t demo-web-app:1.0.0 .
docker run --name demo-web-app -d -p 8080:8080 demo-web-app:1.0.0
