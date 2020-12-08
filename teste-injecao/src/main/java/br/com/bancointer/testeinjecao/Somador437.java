package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador437")
public class Somador437 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
