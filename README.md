# Build
mvn clean package && docker build -t org.example/health .

# RUN

docker rm -f health || true && docker run -d -p 8080:8080 -p 4848:4848 --name health org.example/health 