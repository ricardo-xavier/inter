package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1331")
public class Somador1331 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
