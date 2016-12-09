From rangalo/java8
RUN apt-get update
RUN apt-get install -y mysql-client && \
    rm -rf /var/lib/apt/lists/*

ADD scripts/* /
RUN chmod +x /*.sh
ADD target/blog-*.jar /

CMD ["./run-blog.sh"]
