* Pull Postgresql db first on docker
* then run Postgres db
-> docker run --name postgres-db -p 5432:5432 -e POSTGRES_PASSWORD=123 -v /home/glovenkevin/Documents/Spring-Boot/certificate.gen/postgres-data/:/var/lib/postgresql/data -d  postgres
-> create DB for your project