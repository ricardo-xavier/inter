package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1375")
public class Somador1375 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
