package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador54")
public class Somador54 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
