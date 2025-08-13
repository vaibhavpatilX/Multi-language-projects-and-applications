package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map<Long, BatchEntry> batchentries = new HashMap<>();

    //HTTP : GET
    //R : Read
    //select * from batches;
    @GetMapping
    public List<BatchEntry> getAll()
    {
        return new ArrayList<>(batchentries.values());
    }
    //HTTP : POST
    // C : create
    //insert into batches values(1,"PPA",25000);
    @PostMapping
    public boolean createEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(),myentry);
        return true;
    }
    //HTTP : GET
    //R : Read
    //select * from student;
    @GetMapping("/id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable Long myid)
    {
        return  batchentries.get(myid);
    }

    //HTTP : DELETE
    //D : D
    //delete from batches where id = 1;
    @DeleteMapping("/id/{myid}")
    public BatchEntry deleteEntryById(@PathVariable Long myid)
    {
        return batchentries.remove(myid);
    }

    //HTTP : PUT
    //update batches set fees = 30000 where id = 1;
    @PutMapping("/id/{myid}")
    public BatchEntry updateEntryById(@PathVariable Long myid,@RequestBody BatchEntry myentry)
    {
        return batchentries.put(myid,myentry);
    }

    //HTTP : GET
    //R : Read
    //GET BY NAME
    @GetMapping("/name/{myname}")
    public BatchEntry getBatchEntryByName(@PathVariable String myname)
    {
        for(BatchEntry Bentry : batchentries.values())
        {
            if(Bentry.getName().equals(myname))
            {
                return Bentry;
            }
        }
        return null;
    }

    //GET BY MIN FEES
    @GetMapping("/fees/min")
    public BatchEntry getBatchEntryByMinFees()
    {
        //filtre
        if (batchentries.isEmpty())
        {
            return null;
        }

        BatchEntry minEntry = null;
        for (BatchEntry Bentry : batchentries.values())
        {
            if (minEntry == null)
            {
                minEntry = Bentry;
            }
            else if (Bentry.getFees() < minEntry.getFees())
            {
                minEntry = Bentry;
            }
        }
        return minEntry;
    }
}
