//package io.cloudledger.paperflow.config;
//
//import io.cloudledger.paperflow.domain.instance.Instance;
//import io.cloudledger.paperflow.domain.instance.InstanceRepository;
//import io.cloudledger.paperflow.domain.instance.InstanceStatus;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//@Component
//@RequiredArgsConstructor
//public class Initializer implements CommandLineRunner {
//
//    private final InstanceRepository instanceRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        if (instanceRepository.count() ==0) {
//            // Create a new instance
//            Instance instance = new Instance();
//            instance.setTenant("XXX-Tenant-XXX");
//            instance.setName("Test Instance 1");
//            instance.setStartDate(LocalDate.now());
//            instance.setInstanceStatus(InstanceStatus.ACTIVE);
//            instance = instanceRepository.save(instance);
//        }
//    }
//}
