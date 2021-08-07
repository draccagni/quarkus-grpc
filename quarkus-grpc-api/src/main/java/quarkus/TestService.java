package quarkus;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class TestService extends MutinyTestGrpc.TestImplBase {

    public Uni<TestReply> test(TestRequest request) {
        return Uni.createFrom().item(() ->
                TestReply.newBuilder().setTest("quarkus").build());
    }

}
