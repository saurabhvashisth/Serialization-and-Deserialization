if [[ $1 == "-c" ]]
then 
	echo Compiling
	javac ./*/*.java
fi
if [[ $1 == "-s" ]]
then
	if [[ $2 == "-j" ]]
	then
		java ds.JSONserialize $3
	fi
	if [[ $2 == "-p" ]]
	then
		java ds.newprotobuf $3
	fi
fi
if [[ $1 == "-d" ]]
then
	if [[ $2 == "-j" ]]
	then
		java ds.JSONdeserialize $3
	fi
	if [[ $2 == "-p" ]]
	then
		java ds.deserializeproto $3
	fi
fi
if [[ $1 == "-t" ]]
then
	if [[ $2 == "-j" ]]
	then
		java ds.JSONserialize $3
		java ds.JSONdeserialize "result.json"
	fi
	if [[ $2 == "-p" ]]
	then
		java ds.newprotobuf $3
		java ds.deserializeproto "result_protobuf"
	fi
fi
