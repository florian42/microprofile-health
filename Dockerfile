FROM payara/micro
COPY ./target/health-example.war $DEPLOY_DIR
