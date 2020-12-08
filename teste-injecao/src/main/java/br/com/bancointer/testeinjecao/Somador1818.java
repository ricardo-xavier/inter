package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1818")
public class Somador1818 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
