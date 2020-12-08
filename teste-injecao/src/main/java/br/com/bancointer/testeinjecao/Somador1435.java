package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1435")
public class Somador1435 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
