package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador943")
public class Somador943 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
