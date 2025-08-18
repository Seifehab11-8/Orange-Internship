FROM mariadb:latest

ENV MARIADB_ROOT_PASSWORD=password
ENV MARIADB_DATABASE=online_store
ENV MARIADB_USER=myuser
ENV MARIADB_PASSWORD=root

EXPOSE 3306

# •	root + MARIADB_ROOT_PASSWORD = full access (superuser).
# •	myuser + MARIADB_PASSWORD = limited access (only to MARIADB_DATABASE).