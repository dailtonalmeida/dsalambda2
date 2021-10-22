aws lambda create-function \
	--function-name myLambdaComPOJO \
	--runtime java11 \
	--zip-file fileb://target/dsalambda2-1.0-SNAPSHOT.jar \
	--handler br.nom.dailton.dsalambda2.LambdaRequestHandlerFromPOJO::handleRequest \
	--role arn:aws:iam::988015039754:role/service-role/myFirstJavaLambda-role-52lrla5v
