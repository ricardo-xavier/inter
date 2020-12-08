package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1669")
public class Somador1669 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
