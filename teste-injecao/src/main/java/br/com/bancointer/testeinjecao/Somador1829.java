package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1829")
public class Somador1829 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
