@echo off


docker-compose down -v


docker-compose up -d 

docker-compose logs mongodb

pause