include modules.prop

NS_DIR=$(subst .,/,${NAMESPACE})
SUBDIR=${MODULES}

main:${MODULES}

${MODULES}:
	if [ ! -f $@/pom.xml ]; then \
		mvn archetype:generate \
		-DarchetypeGroupId=org.apache.maven.archetypes \
		-DarchetypeArtifactId=maven-archetype-quickstart \
		-DarchetypeVersion=RELEASE \
		-DgroupId=${NAMESPACE} \
		-DartifactId=$@ \
		-DinteractiveMode=false; \
		mkdir -p $@/src/main/resources; \
		mkdir -p $@/src/main/java/${NS_DIR}/$@; \
		cp ../auto/MainApp.java $@/src/main/java/${NS_DIR}/$@; \
		rm -rf  $@/src/test; \
		rm -rf  $@/src/main/java/${NS_DIR}/App.java; \
		sed -i  's/%NAMESPACE%/${NAMESPACE}.$@/g'  $@/src/main/java/${NS_DIR}/$@/MainApp.java;  \
		cp ../auto/SpringBeans.xml $@/src/main/resources; \
		sed -i  's/%NAMESPACE%/${NAMESPACE}.$@/g'  $@/src/main/resources/SpringBeans.xml; \
		cd $@  && mvn eclipse:clean && mvn eclipse:eclipse; \
	fi

pkg:
	mvn package
	
clean:
	mvn clean

####################################
#	for dir in $(SUBDIRS); do \
#		cd $${dir} && mvn clean; \
#	done
####################################

.PHONY: ${MODULES}
	
print:
	@echo "Project=${PROJECT}"
	@echo "Version=${VERSION}"
	@echo "Namespace=${NAMESPACE}"
	@echo "Namespace Dir=${NS_DIR}"	
	@echo "Moodules=${MODULES}"
	