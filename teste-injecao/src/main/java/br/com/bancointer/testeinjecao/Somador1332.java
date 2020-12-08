package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1332")
public class Somador1332 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
