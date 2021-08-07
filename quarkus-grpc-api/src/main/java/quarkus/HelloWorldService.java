package quarkus;

import java.util.concurrent.atomic.AtomicInteger;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

//@GrpcService
public class HelloWorldService { /* extends MutinyGreeterGrpc.GreeterImplBase {

    AtomicInteger counter = new AtomicInteger();

    @Override
    public Uni<HelloReply> sayHello(HelloRequest request) {
        int count = counter.incrementAndGet();
        String name = request.getName();
        return Uni.createFrom().item("Hello " + name)
                .map(res -> HelloReply.newBuilder().setMessage(res).setCount(count).build());
    }
    */
}

