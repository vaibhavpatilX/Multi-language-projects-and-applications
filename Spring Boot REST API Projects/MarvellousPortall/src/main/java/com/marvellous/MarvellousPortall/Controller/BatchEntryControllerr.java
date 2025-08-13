package com.marvellous.MarvellousPortall.Controller;

import com.marvellous.MarvellousPortall.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryControllerr
{
    private Map<Long, BatchEntry> batchenties = new HashMap<>();

    @GetMapping
    public List<BatchEntry> getAll()
    {
        return new ArrayList<>(batchenties.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody BatchEntry myentry)
    {
        batchenties.put(myentry.getId(),myentry);
        return true;
    }

}
