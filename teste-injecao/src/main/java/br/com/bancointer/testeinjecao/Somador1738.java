package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1738")
public class Somador1738 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
