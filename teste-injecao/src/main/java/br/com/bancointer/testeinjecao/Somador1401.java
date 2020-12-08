package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1401")
public class Somador1401 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
