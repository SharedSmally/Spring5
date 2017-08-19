NAMESPACE=com.jpw.springex
VERSION=1.0.0
PROJECTS=base

#PROJECTS=base beans app spel test jmx jms jdbc tx orm oxm

main:${PROJECTS}

${PROJECTS}:
	@if [ ! -f $@/pom.xml ]; then \
		mvn archetype:generate \
		-DarchetypeGroupId=org.codehaus.mojo.archetypes \
		-DarchetypeArtifactId=pom-root \
		-DarchetypeVersion=RELEASE \
		-DgroupId=${NAMESPACE} \
		-DartifactId=$@ \
		-Dversion=${VERSION}  \
		-DinteractiveMode=false; \
	fi
	@if [ ! -f $@/modules.prop ]; then \
		cp auto/module.mk $@/makefile; \
		echo "PROJECT=$@" > $@/modules.prop; \
		echo "VERSION=${VERSION}" >> $@/modules.prop;\
		echo "NAMESPACE=${NAMESPACE}.$@" >> $@/modules.prop; \
		echo "MODULES=" >> $@/modules.prop;\
		rm -rf $@/bin; \
	fi
	
.PHONY: ${PROJECTS}

cleanall:
	rm -rf ${PROJECTS}
	
checkout:
	cd ../; git clone https://github.com/SharedSmally/Spring5.git
