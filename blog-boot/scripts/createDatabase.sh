#!/bin/bash

DB_HOST=${DB_HOST:-mysqldb}
DB_PORT=${DB_PORT:-3306}
BLOG_DB=${BLOG_DB:-blog}
BLOG_DB_USER=${BLOG_DB_USER:-blog}
BLOG_DB_PASS=${BLOG_DB_PASS:-blog}

function createDB() {
  
    echo "=> Creating db=$BLOG_DB"
    mysql -u admin  -psecret -h $DB_HOST -P $DB_PORT  -e "CREATE DATABASE IF NOT EXISTS $BLOG_DB"
    echo "=> Done"
}

function createUser() {
    
    echo "=> Creating user=${BLOG_DB_USER}"
    mysql -u admin -psecret -h $DB_HOST -P $DB_PORT -e "CREATE USER '${BLOG_DB_USER}'@'%' IDENTIFIED BY '${BLOG_DB_PASS}'"
    mysql -u admin -psecret -h $DB_HOST -P $DB_PORT -e "GRANT ALL PRIVILEGES ON ${BLOG_DB}.* TO '${BLOG_DB_USER}'@'%'"
    echo "=> Done"
}

createDB
createUser
