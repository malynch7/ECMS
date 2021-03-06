package com.beigeoranges.ecms.Controllers;

import com.beigeoranges.ecms.Dao.ArchivedEventDao;
import com.beigeoranges.ecms.Dao.EventDao;
import com.beigeoranges.ecms.Dao.UserDao;
import com.beigeoranges.ecms.Model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;

@Controller
public class ArchivedEventController {

    @Autowired
    private EventDao eventDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ArchivedEventDao archivedEventDao;


    @RequestMapping(value = "player/viewArchived", method = RequestMethod.GET)
    public String viewArchivedEvents(Model model, Principal principal) {

        String userName = principal.getName();
        int userId = Math.toIntExact((userDao.findUserAccount(userName)).getUserId());

        List<Event> archivedEvents = archivedEventDao.getPlayersArchivedEvents(userId);
        model.addAttribute("archivedEvents", archivedEvents);

        return "player/viewArchived";
    }

    @RequestMapping(value = "admin/viewArchived", method = RequestMethod.GET)
    public String viewAllArchivedEvents(Model model) {


        List<Event> archivedEvents = archivedEventDao.getArchivedEvents();
        model.addAttribute("archivedEvents", archivedEvents);

        return "admin/viewArchived";
    }
}
