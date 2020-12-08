package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1837")
public class Somador1837 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
