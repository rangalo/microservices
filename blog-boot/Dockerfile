From rangalo/java8

MAINTAINER rangalo "hard.mehta@gmail.com"

RUN apt-get update
RUN apt-get install -y mysql-client && \
    rm -rf /var/lib/apt/lists/*

ADD scripts/* /
RUN chmod +x /*.sh
ADD target/blog-*.jar /

CMD ["./run-blog.sh"]
