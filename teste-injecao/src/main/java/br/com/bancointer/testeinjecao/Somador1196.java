package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1196")
public class Somador1196 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
