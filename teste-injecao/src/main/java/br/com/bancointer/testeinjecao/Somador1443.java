package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1443")
public class Somador1443 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
