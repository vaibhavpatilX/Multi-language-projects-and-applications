package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryService batchEntryService;

    @GetMapping
    public List <BatchEntry> getAll()
    {
        return  batchEntryService.getAll();
    }

    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchEntryService.saveEntry(myentry);
        return "Document inserted successfully..!";
    }

    @GetMapping("/id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable ObjectId myid)
    {
        return batchEntryService.findById((myid)).orElse(null);
    }
    @DeleteMapping("/id/{myid}")
    public boolean deleteEntryById(@PathVariable ObjectId myid)
    {
        batchEntryService.deleteById(myid);
        return  true;
    }

    @PutMapping("/id/{myid}")
    public void updateEntryById(@PathVariable ObjectId myid, @RequestBody BatchEntry mynewentry)
    {
        BatchEntry isEntry = batchEntryService.findById(myid).orElse(null);

        if(isEntry != null)
        {
            isEntry.setName(mynewentry.getName());
            isEntry.setFees(mynewentry.getFees());
        }

        batchEntryService.saveEntry(isEntry);   //important aahe
    }

}
