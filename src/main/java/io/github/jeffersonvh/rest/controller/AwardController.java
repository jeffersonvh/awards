package io.github.jeffersonvh.rest.controller;

import io.github.jeffersonvh.domain.entity.Award;
import io.github.jeffersonvh.domain.repository.Awards;
import io.github.jeffersonvh.domain.util.CsvUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;


@Controller
@RequestMapping("/api/awards")
public class AwardController {

    @RequestMapping(value = "/awards")
    @ResponseBody
    public String helloAward( ){
        return "awards";
    }

    @PostMapping(value = "/loadAwards", consumes = "text/csv")
    public void uploadSimple(@RequestBody InputStream body) throws IOException {
        Awards.saveAll(CsvUtils.read(Award.class, body));
    }

}
