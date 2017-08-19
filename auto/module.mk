include modules.prop
NS_DIR=

main:${MODULES}

${MODULES}:
	if [ ! -d $@/pom.xml ]; then \
		mvn archetype:generate \
		-DarchetypeGroupId=org.apache.maven.archetypes \
		-DarchetypeArtifactId=maven-archetype-quickstart \
		-DarchetypeVersion=RELEASE \
		-DgroupId=${NAMESPACE} \
		-DartifactId=$@ \
		-DinteractiveMode=false; \
		cd $@ && mvn eclipse:eclipse; \
	fi	 

.PHONY: ${MODULES}

print:
	@echo "Project=${PROJECT}"
	@echo "Version=${VERSION}"
	@echo "Namespace=${NAMESPACE}"	
	@echo "Moodules=${MODULES}"