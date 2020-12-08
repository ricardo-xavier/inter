package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1100")
public class Somador1100 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
