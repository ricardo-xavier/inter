package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador828")
public class Somador828 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
