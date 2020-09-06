MAVEN=mvn

LOG_DIR=logs

clean:
	@rm -rf ${LOG_DIR}
	@${MAVEN} clean

compile:
	@${MAVEN} compile

run:
	@${MAVEN} exec:java

