MAVEN=mvn

LOG_DIR=logs

clean:
	@rm -rf ${LOG_DIR}

build:
	@${MAVEN} compile

run:
	@${MAVEN} exec:java

