package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador68")
public class Somador68 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
