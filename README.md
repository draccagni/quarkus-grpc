# Quarkus gRPC

If the proto file is defined in an external jar, the gRPC server starts properly in dev mode (by running mvn quarkus:dev command), but it doesn't start if the app is running into a container. Instead, if a proto file is present in the main jar, the gRPC server starts properly and the service defined by the proto in the external jar is available, too. Renaming the helloworld.proto_ file and uncommenting the HelloWorldService you can reproduce the two cases.
