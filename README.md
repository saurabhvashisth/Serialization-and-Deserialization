		
#Saurabh Vashisth

------------------------------------------------------------------------------------------------
IT IS RECOMEMDED TO READ THE README BEFORE RUNNING THE SCRIPT  
------------------------------------------------------------------------------------------------

 **INDEX**  

1. INTRODUCTION  
2. HOW TO RUN  

------------------------------------------------------------------------------------------------
1. INTRODUCTION  
------------------------------------------------------------------------------------------------

	Four Java classes have been made for serialization and deserialization of data using JSON   
	and Google Protobuf.Differences in time and size of serialization and deserialization   
	can also be observed.  

------------------------------------------------------------------------------------------------
2. HOW TO RUN  
------------------------------------------------------------------------------------------------
	
	1. Run the command "bash script.sh" with the following arguments.  
	2. -c : compile the code  
	3. -s -j <INPUT_FILE> : to serialize the given input to json format and write to "result.json".  
	4. -s -p <INPUT_FILE> : to serialize the given input to protobuf format and write to "result_protobuf".  
	5. -d -j <JSON_FILE> : to de-serialize the json file and write records to "output_json.txt".  
	6. -d -p <PROTOBUF_FILE> : to de-serialize protobuf file and write records to "output_protobuf.txt”.  
	7. -t -j <INPUT_FILE> : to find time and rate of serialization and deserialization of the given input file  
	   with json as intermediate format.  
	8. -t -p <INTPUT_FILE> :to find time and rate of serialization and deserialization of the given input file  
	   with protobuf as intermediate format.  
