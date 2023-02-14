package zw.co.afrosoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.service.LeaveRequest;
import zw.co.afrosoft.service.LeaveService;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class LeaveController {

    private final LeaveService leaveService;


    @PostMapping("applyLeave")
    public ResponseEntity applyLeave(@RequestBody LeaveRequest request){

        return leaveService.applyLeave(request);
    }
    @GetMapping("getPendingLeaves")
    public ResponseEntity getAll(){

        return leaveService.getAll();
    }
    @GetMapping("getApprovedLeaves")
    public ResponseEntity getAllApproved(){

        return leaveService.getAllApproved();
    }
    @GetMapping("getRejectedLeaves")
    public ResponseEntity getAllRejected(){

        return leaveService.getAllRejected();
    }
    @GetMapping("getAllLeaves")
    public ResponseEntity getAllLeaves(){

        return leaveService.getAllLeaves();
    }
    @PutMapping("/approve/{id}")
    public  ResponseEntity approveLeave(@PathVariable Long id){
        return leaveService.approveLeave(id);
    }

    @PutMapping("/reject/{id}")
    public  ResponseEntity rejectLeave(@PathVariable Long id){
        return leaveService.rejectLeave(id);
    }

}
