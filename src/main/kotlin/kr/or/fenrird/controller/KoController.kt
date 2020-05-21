package kr.or.fenrird.controller

import kr.or.fenrird.jpa.repo.Korepo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KoController {

    @Autowired
    lateinit var korepo: Korepo

    @GetMapping("/hi")
    fun hi () = korepo.findAll()
}
