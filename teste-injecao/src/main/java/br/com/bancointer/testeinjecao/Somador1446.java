package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1446")
public class Somador1446 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
