package config

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("/rest") class ApplicationConfig : Application()
