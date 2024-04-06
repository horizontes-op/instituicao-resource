package insper.store.instituicao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstituicaoResource implements InstituicaoController {

    @Autowired
    private InstituicaoService instituicaoService;

    @GetMapping("/instituicao/info")
    public ResponseEntity<Map<String, String>> info() {
        return new ResponseEntity<Map<String, String>>(
            Map.ofEntries(
                Map.entry("microservice.name", InstituicaoApplication.class.getSimpleName()),
                Map.entry("os.arch", System.getProperty("os.arch")),
                Map.entry("os.name", System.getProperty("os.name")),
                Map.entry("os.version", System.getProperty("os.version")),
                Map.entry("file.separator", System.getProperty("file.separator")),
                Map.entry("java.class.path", System.getProperty("java.class.path")),
                Map.entry("java.home", System.getProperty("java.home")),
                Map.entry("java.vendor", System.getProperty("java.vendor")),
                Map.entry("java.vendor.url", System.getProperty("java.vendor.url")),
                Map.entry("java.version", System.getProperty("java.version")),
                Map.entry("line.separator", System.getProperty("line.separator")),
                Map.entry("path.separator", System.getProperty("path.separator")),
                Map.entry("user.dir", System.getProperty("user.dir")),
                Map.entry("user.home", System.getProperty("user.home")),
                Map.entry("user.name", System.getProperty("user.name")),
                Map.entry("jar", new java.io.File(
                    InstituicaoApplication.class.getProtectionDomain()
                        .getCodeSource()
                        .getLocation()
                        .getPath()
                    ).toString())
            ), HttpStatus.OK
        );
    }

    @Override
    public ResponseEntity<InstituicaoOut> create(InstituicaoIn in) {
        // parser
        Instituicao instituicao = InstituicaoParser.to(in);
        // insert using service
        instituicao = instituicaoService.create(instituicao);
        return ResponseEntity.ok(InstituicaoParser.to(instituicao));
    }

    @Override
    public ResponseEntity<InstituicaoOut> read(String id) {
        final InstituicaoOut instituicao = InstituicaoOut.builder()
            .id(id)
            .build();
        return ResponseEntity.ok(instituicao);
    }

    @Override
    public ResponseEntity<InstituicaoOut[]> readAll() {
        final InstituicaoOut[] instituicoes = new InstituicaoOut[] {
            InstituicaoOut.builder()
                .id("1")
                .build(),
            InstituicaoOut.builder()
                .id("2")
                .build()
        };
        return ResponseEntity.ok(instituicoes);
    }
    
}
