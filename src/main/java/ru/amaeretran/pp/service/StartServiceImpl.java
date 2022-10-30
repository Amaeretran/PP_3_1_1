package ru.amaeretran.pp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StartServiceImpl implements StartService {
    @Override
    public List<String> getMessages() {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm users table application");
        messages.add("Click to button if you want show table");
        return messages;
    }
}
